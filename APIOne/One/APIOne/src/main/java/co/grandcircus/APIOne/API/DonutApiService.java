package co.grandcircus.APIOne.API;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.APIOne.Models.Donut;
import co.grandcircus.APIOne.API.DonutsResponse;

@Service
public class DonutApiService {

	private RestTemplate request = new RestTemplate();
	
	public List<Donut> getAllDonuts() {
	
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
				return request.getForObject(url,DonutsResponse.class).getResults();
	
		  
	}
	public Donut getDonutById(Integer id) {
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{id}.json";
	
				return request.getForObject(url,Donut.class,id);
	}
}
