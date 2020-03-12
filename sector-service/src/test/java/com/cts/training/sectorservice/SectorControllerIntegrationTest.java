package com.cts.training.sectorservice;


import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cts.training.sectorservice.entity.Sector;


@SpringBootTest(classes = SectorServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class SectorControllerIntegrationTest {
	
//	@LocalServerPort
	private int port=8003;
	HttpHeaders headers=new HttpHeaders();
	TestRestTemplate restTemplate=new TestRestTemplate();

	@Test
	public void test1() throws Exception {
		String url="http://localhost:"+port+"/sector";
		System.out.println("URL: "+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
		String expected="{\"id\": 109,\"name\": \"IT\",\"brief\": \"Information Technology\"}";
//		String expected="{\"id\":109";
		System.out.println("Test: Response body: "+response.getBody());
//		assertTrue(response.getBody().contains(expected));
	}
	
	@Test
	public void test2() throws Exception {
		String url="http://localhost:"+port+"/sector";
		System.out.println("URL: "+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		Sector sector=new Sector("Management","Best Company");
		HttpEntity<Sector> entity=new HttpEntity<Sector>(sector,headers);
		ResponseEntity<String> response=restTemplate.exchange(url, HttpMethod.POST,entity,String.class);
		String expected="\"name\": \"Management\",\"brief\": \"Best Company\"}";
//		String expected="{\"id\":109";
		System.out.println("Test: Response body: "+response.getBody());
//		assertTrue(response.getBody().contains(expected));
	}

}
