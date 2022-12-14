package Controller;

import Model.RankingCavalo;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Cliente {
    public static List<RankingCavalo> cliente(int cavaloAposta, Double valorAposta) {
        Socket socket;
        final int PORTA = 1234;
        final String IP = "127.0.0.1";
        PrintStream out;
        Scanner in;
        List<String> resultList = null;

        try {
            socket = new Socket(IP, PORTA);
            out = new PrintStream(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            // enviando o cavalo que foi feita a aposta
            System.out.println("Corrida de Cavalos");
            Thread.sleep(1 * 1000);
            System.out.println("Cavalos -> 1-Imperatriz, 2-Duque, 3-Princesa (vc sabe quem), 4-Pé de Pano, 5-Pangaré");
            Thread.sleep(1 * 1000);
            System.out.println("");
            System.out.print("Escolha o número do cavalo em que você irá apostar (1 a 5): ");
            System.out.println(cavaloAposta);
            Thread.sleep(1 * 1000);
            System.out.println("Quanto deseja apostar: ");
            System.out.println(valorAposta.toString());

            out.println(cavaloAposta-1);
            out.println(valorAposta);

            String resultado = in.nextLine();
            resultado = resultado.replace("[", "");
            resultado = resultado.replace("]", "");
            resultList = Arrays.asList(resultado.split(", "));
            System.out.println(resultado);
            System.out.println(resultList);

            socket.close();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
        
        return mapperRankingCavalos(resultList);
    }
    
    private static List<RankingCavalo> mapperRankingCavalos(List<String> resultados){
            List<RankingCavalo> rankingCavalos = new ArrayList<>();
            for(int i = 0; i < resultados.size() ;  i+=2){
                RankingCavalo rankingCavalo = new RankingCavalo(resultados.get(i));
                rankingCavalo.setTempoCavalo(Long.parseLong(resultados.get(i+1)));
                rankingCavalos.add(rankingCavalo);
            }
            
        
        return rankingCavalos;
    }
}
