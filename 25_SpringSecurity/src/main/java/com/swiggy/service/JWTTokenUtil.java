package com.swiggy.service;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JWTTokenUtil{

	// Token Creation : JWT API

		// 1. Subject : UserName
		// 2. At what time it is created : Created Time
		// 3. Expired time : 3 Mins

		private long expMilliSeconds = 3 * 60000;
		private final String SECRET_KEY = "HSHDHSDJKDSDSHKDDFKDFJDJFDJFFKDFDKFKFSFSDKFDNKF"
				+ "HDHSDSHDSJDSHHSDHSDHSDHSDHSDCNVCCXNCNCJDSHDHJDSHDNCNNNNNNHJDHSD";

		public String createToken(String userName) {

			String token = Jwts.builder()
					.setSubject(userName)
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setExpiration(new Date(System.currentTimeMillis() + expMilliSeconds))
					.signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();

			return token;
		}
		

		public boolean isValidtoken(String userName, String token) {
			// Extract User Name from Token
			String tokenUserName = getUsernameFromToken(token);

			// Compare Token User Name with incoming USER Name : userName

			boolean isExpired = isTokenExpired(token);

			return userName.equals(tokenUserName) && !isExpired;
		}

		
		public String getUsernameFromToken(String token) {
			String tokenUserName = Jwts.parser()
					.setSigningKey(SECRET_KEY)
					.parseClaimsJws(token)
					.getBody().getSubject();
			
			return tokenUserName;
		}
		
		

		public boolean isTokenExpired(String token) {
			Date expirationTime = Jwts.parser()
					.setSigningKey(SECRET_KEY)
					.parseClaimsJws(token)
					.getBody().getExpiration();
		
			return expirationTime.before(new Date());
		}
}
