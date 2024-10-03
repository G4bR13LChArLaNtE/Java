package com.dev.charlante.cadastroapp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dev.charlante.cadastroapp.models.ToItemMoldel;
import com.dev.charlante.cadastroapp.repositories.ToItemRepository;




@Component
public class ToItemDataLoader implements CommandLineRunner{
	
	private final Logger logger = LoggerFactory.getLogger(ToItemDataLoader.class);
	
	
	@Autowired
	ToItemRepository toItemRepository;
	
	@Override
	public void run(String...args) throws Exception{
		loadData();
	}
	
	private void loadData() {
		if(toItemRepository.count() == 0) {
			ToItemMoldel toItem1 = new ToItemMoldel("Pegar uma laranja");
			ToItemMoldel toItem2 = new ToItemMoldel("Pegar uma maçã");
			
			
			toItemRepository.save(toItem1);
			toItemRepository.save(toItem2);
			
			
		}
		
		logger.info("Numero de produtos {}", toItemRepository.count());
	}
	

}
