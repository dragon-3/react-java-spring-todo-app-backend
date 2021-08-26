package com.dragon3.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
    //{
    //	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkcmFnb24zIiwiZXhwIjoxNjMwNDYyNzA3LCJpYXQiOjE2Mjk4NTc5MDd9.PLqR5pMG_45cmmiw8MGLtVAt9UsbQQrO8crW75u9OZ2LztdV2u18hkCJcu38qkk1s8vUopHfomAJt961m7tlUA"
    //	}

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

