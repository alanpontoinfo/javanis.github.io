package br.com.alpis.saboreartedelivery.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.alpis.saboreartedelivery.dto.Notificacao;



@Component
@Profile("!prod")
public class DevNotificacaoConfig implements Notificacao {

	@Override
	public boolean envioAtivo() {
		return false;
	}

}
