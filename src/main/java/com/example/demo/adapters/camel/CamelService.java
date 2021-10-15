package com.example.demo.adapters.camel;

import com.example.demo.domain.TransferirArquivoService;
//import com.example.demo.infra.RotaHttpTestes;
import com.example.demo.infra.RotaTestes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CamelService implements TransferirArquivoService {

    private final RotaTestes rotaTestes;
    //private final RotaHttpTestes rotaHttpTestes;

    @Override
    public void transferir() throws Exception {
        rotaTestes.configure();
    }

    @Override
    public void getHttp() throws Exception {
        //rotaHttpTestes.configure();
    }


}
