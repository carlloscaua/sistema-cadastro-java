document.addEventListener('DOMContentLoaded', () => {

    // Trata o envio do formulário de Login
    const formLogin = document.getElementById('form-login');
    if (formLogin) {
        formLogin.addEventListener('submit', (event) => {
            event.preventDefault();
            const email = document.getElementById('login-email').value;
            alert(`Login realizado com sucesso para o e-mail: ${email}`);
        });
    }

    // Trata o envio do formulário de Cadastro
    const formCadastro = document.getElementById('form-cadastro');
    if (formCadastro) {
        formCadastro.addEventListener('submit', (event) => {
            event.preventDefault();
            const nome = document.getElementById('cad-nome').value;
            const curso = document.getElementById('cad-curso').value;
            
            alert(`Cadastro de ${nome} no curso [${curso}] realizado com sucesso!`);
            formCadastro.reset();
        });
    }

    // Trata o envio do Questionário
    const formQuestionario = document.getElementById('form-questionario');
    if (formQuestionario) {
        formQuestionario.addEventListener('submit', (event) => {
            event.preventDefault();
            alert('Questionário enviado com sucesso!');
            formQuestionario.reset();
        });
    }

});