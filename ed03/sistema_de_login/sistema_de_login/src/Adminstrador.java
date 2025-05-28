/**
 * A classe Administrador representa um usuário com privilégios administrativos.
 * Implementa as interfaces Autenticavel, Gerenciavel e Logavel.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {
    /**
     * Construtor para criar uma nova instância de Administrador.
     *
     * @param login O nome de login do administrador.
     * @param senha A senha do administrador.
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o administrador verificando se a senha fornecida corresponde à senha armazenada.
     *
     * @param senha A senha a ser verificada.
     * @return `true` se a senha for igual à armazenada, `false` caso contrário.
     */
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    /**
     * Altera a senha do administrador para a nova senha fornecida e exibe uma mensagem de sucesso.
     *
     * @param novaSenha A nova senha para o administrador.
     */
    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    /**
     * Simula o bloqueio do usuário administrador e exibe uma mensagem de sucesso.
     */
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    /**
     * Registra uma operação específica realizada pelo administrador no log de auditoria.
     *
     * @param operacao A descrição da operação a ser registrada.
     */
    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}