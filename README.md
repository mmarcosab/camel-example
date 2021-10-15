### camel-example

Qual é a motivação do apache camel?
A integração entre aplicações.
Busca resolver diferentes formatos, padrões e protocolos que podem existir em uma integração entre sistemas

Livro: Enterprise Integration Patterns

O apache camel é como um entregador dos correios, leva dados de um lugar para outro.


de_onde()
transforma()
filtra()
divide()
valida()
....
para_onde()

Usa a camel DSL - uma linguagemd e domínio para uso do camel

A partir do CamelContext as rotas são definidas

Transferir arquivos entre diretórios:


```
@Component
public class RotaTestes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:dir1").
                log("${body}").
                to("file:dir2");
    }
}
´´´



