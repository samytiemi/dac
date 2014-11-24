function validarSenha(){
	senha = document.f1.senha1.value
	senha1 = document.f1.senha2.value
 
	if (senha == senha1)
		document.FormCadastro.submit();
	else
		alert("SENHAS DIFERENTES")
}



