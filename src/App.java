public class App {
    public static void main(String[] args) throws Exception {
        ViewMain calculadora = new ViewMain();
        Eventos evento = new Eventos(calculadora);

        calculadora.evento(evento);
    }
}
