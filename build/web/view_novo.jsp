<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- A linha abaixo faz a inserção do arquivo topo.jsp --%>
<c:import url="topo.jsp" />

<div class="alert-success text-center espaco">
    Novo Aluno
</div>

<form name="novo" method="post" action="view_mensagem.jsp">
    <div style="margin: 0px 0px 0px 40px;">
        <div style="text-align: left;">
            <div style="margin: 0px 0px 20px 0px;">
                <label>Telefone Fixo:</label>

                <input
                    title="DDD"
                    maxlength="2"
                    type="text"
                    size="3"
                    value="">

                -

                <input
                    title="telefone"
                    style="text-align: center;"
                    maxlength="9"
                    size="7"
                    type="text"
                    name="TELEFONE"
                    value=""/>

                <label style="margin: 0px 0px 0px 20px;">Telefone Celular:</label>

                <input
                    title="DDD"
                    maxlength="2"
                    type="text"
                    size="3"
                    value="">

                -

                <input
                    title="telefone"
                    style="text-align: center;"
                    maxlength="9"
                    size="7"
                    type="text"
                    name="TELEFONE"
                    value=""/>
            </div>
            
        </div>
        <div style="text-align: left">
            <div style="margin: 0px 0px 20px 0px;">
                <label>Nome:</label>
                <input
                    title="Seu nome completo"
                    style="text-align: center;"
                    size="30"
                    type="text"
                    name="nome"
                    value="" />
           
                <label style="margin: 0px 0px 0px 20px;">Data de nascimento: </label>
                <input
                    title="dia"
                    style="text-align: center;"
                    maxlength="2"
                    type="text"
                    class=""
                    name="curso"
                    value="" 
                    size="2"/> /
                <input
                    title="mês"
                    style="text-align: center;"
                    maxlength="2"
                    type="text"
                    class=""
                    name="curso"
                    value="" 
                    size="2"/> /
                <input
                    title="ano"
                    style="text-align: center;"
                    maxlength="4"
                    type="text"
                    class=""
                    name="curso"
                    value="" 
                    size="4"/>

            </div>
        </div>
        <div style="text-align: left">
            <div style="margin: 0px 0px 20px 0px;">
                <label Style="margin: 0px 0px 0px 0px;">Endereço:</label>
                <input
                    title="Endereço residencial ou condomínio"
                    style="text-align: center;"
                    size="30"
                    type="text"
                    name="endereço"
                    value="" />
                <label Style="margin: 0px 0px 0px 30px;">nº</label>
                <input
                    title="Seu número da casa ou apartamento"
                    style="text-align: center;"
                    type="text"
                    size="5"
                    name="NUMERO DA CASA"
                    value=""><br>

                <label style="margin: 30px 0px 0px 0px;">E-mail</label>
                <input
                    style="text-align: center;"
                    size="30"
                    type="text"
                    name="email"
                    value=""/>
                <label style="margin: 30px 0px 0px 20px;">CPF</label>
                <input
                    title="Nome do responsável caso seja menor de idade"
                    style="text-align: center;"
                    size="20"
                    type="text"
                    name="email"
                    value=""/>
            </div>
        </div>
        <div style="text-align: center">
            <label>Observações:</label><br>
            <textarea name="observações" rows="5" cols="40"></textarea>
        </div>
        <div style="text-align: center">
            <div style="margin: 10px 0px 20px 0px;">
                <input
                    type="submit"
                    class="btn btn-primary"
                    name="bt_novo"
                    value="Cadastrar" />
            </div>
        </div>
        <input 
            type="hidden"
            name="operacao"
            value="Inserir" />
    </div>
</form>

<c:import url="rodape.jsp" />