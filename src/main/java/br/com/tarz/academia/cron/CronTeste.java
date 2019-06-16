package br.com.tarz.academia.cron;

import java.util.Date;
import java.util.logging.Logger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronTeste {
	
	public static final Logger LOG = Logger.getLogger(CronTeste.class.getName());
	
	@Scheduled(cron = "0/15 * * * * *")
	public void teste() {
		LOG.info("TESTANDO CRON: " + new Date().getSeconds());
	}

}
