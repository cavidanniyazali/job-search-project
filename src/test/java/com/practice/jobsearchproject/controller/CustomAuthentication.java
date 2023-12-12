//package com.practice.jobsearchproject.controller;
//
//import com.practice.jobsearchproject.config.security.service.CustomUserDetails;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//
//import java.util.Collection;
//@RequiredArgsConstructor
//public class CustomAuthentication implements Authentication {
//    private final CustomUserDetails customUserDetails;
//    private boolean authenticated = true;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//    @Override
//    public Object getCredentials() {
//        return null;
//    }
//
//    @Override
//    public Object getDetails() {
//        return null;
//    }
//
//    @Override
//    public Object getPrincipal() {
//        return customUserDetails;
//    }
//
//    @Override
//    public boolean isAuthenticated() {
//        return authenticated;
//    }
//
//    @Override
//    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
//        this.authenticated = authenticated;
//    }
//
//    @Override
//    public String getName() {
//        return customUserDetails.getUserAuthentication().getEmail();
//    }
//}
