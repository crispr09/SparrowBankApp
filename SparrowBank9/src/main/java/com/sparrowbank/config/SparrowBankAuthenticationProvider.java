package com.sparrowbank.config;

import com.sparrowbank.entity.Customer;
import com.sparrowbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SparrowBankAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String pass = authentication.getCredentials().toString();

        List<Customer> customerList =customerRepository.findByEmail(userName);

        if(customerList.size()> 0) {
            if(passwordEncoder.matches(pass, customerList.get(0).getPwd())) {

                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add( new SimpleGrantedAuthority(customerList.get(0).getRole()));
                return new UsernamePasswordAuthenticationToken(userName,pass,authorities);
            }
            else {
                throw new BadCredentialsException("bad credentials");
            }
        }
        else {
            throw new BadCredentialsException("No customer registered with this email");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
