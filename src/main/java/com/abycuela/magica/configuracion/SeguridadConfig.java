//package com.abycuela.magica.configuracion;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SeguridadConfig  extends WebSecurityConfigurerAdapter{
//	String[] resources = new String[]{
//            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
//    };
//
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		
//		 http.cors()
//		 .and()
//			 .authorizeRequests()
//			 .antMatchers(HttpMethod.GET,"","")
//			 	.hasAuthority("SCOPE_read")
//			 .antMatchers(HttpMethod.POST,"/cliente/","/login","servidor")
//	         	.hasAuthority("SCOPE_write")
//	         .anyRequest()
//	         .authenticated()
//	         .and()
//	         	.oauth2ResourceServer()
//	         	.jwt();
//		
////		http
////		.authorizeRequests()
////		.antMatchers(resources).permitAll()
////		.anyRequest().authenticated()
////		.and()
////		.formLogin()
////			.loginPage("")
////			.permitAll()
////			.defaultSuccessUrl("")
////			.failureUrl("")
////			.usernameParameter("usuario")
////			.passwordParameter("password")
////			.and()
////			.csrf().disable()
////			.logout()
////				.permitAll()
////				.logoutSuccessUrl("");
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.userDetailsService(userDetailsService)
//	}
//}
