import java.util.Scanner;

public class exercicioDeRevisaoUm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, resposta;

        int idade, percentual = 0, contadorErros = 0;

        System.out.print("Informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Informe a sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); 
        
        do {
            System.out.print("Seu cartão de vacina está em dia? (SIM/NAO) ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                break;

            } else if (resposta.equalsIgnoreCase("nao")) {
                percentual += 10;
                break;
            }
            System.out.println("Resposta inválida! Responda SIM ou NAO.");
        } while (++contadorErros < 3);

        contadorErros = 0;

        do {
            System.out.print("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe) (SIM/NAO) ");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                percentual += 30;
                break;

            } else if (resposta.equalsIgnoreCase("nao")) {
                break;

            }

            System.out.println("Resposta inválida! Responda SIM ou NAO.");

        } while (++contadorErros < 3);

        contadorErros = 0;

        do {
            System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM/NAO) ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                percentual += 30;
                break;

            } else if (resposta.equalsIgnoreCase("nao")) {
                break;
            }
            System.out.println("Resposta inválida! Responda SIM ou NAO.");

        } while (++contadorErros < 3);

        contadorErros = 0;
        do {
            System.out.print("Está retornando de viagem realizada no exterior? (SIM/NAO) ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                percentual += 30;
                System.out.println("Você ficará sob observação por 05 dias.");
                
            break;
            } else if (resposta.equalsIgnoreCase("nao")) {
                break;
            }
            System.out.println("Resposta inválida! Responda SIM ou NAO.");
        } while (++contadorErros < 3);

    
        System.out.println("\n=== DADOS DO PACIENTE ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão Vacinal em Dia: " + (percentual == 0 ? "SIM" : "NAO"));
        System.out.println("Teve Sintomas Recentes: " + (percentual >= 30 ? "SIM" : "NAO"));
        System.out.println("Teve contato com pessoa infectada: " + (percentual >= 30 ? "SIM": "NAO"));
        System.out.println("Retornou de viagem do exterior: " + (percentual >= 30 ? "SIM" : "NAO"));


        if (percentual >= 70) {
        System.out.println("\nVocê apresenta ALTO risco de contágio da COVID-19. Procure uma unidade de saúde imediatamente!");
        } else if (percentual >= 30) {
        System.out.println("\nVocê apresenta MÉDIO risco de contágio da COVID-19. Fique atento aos sintomas!");
        } else {
        System.out.println("\nVocê apresenta BAIXO risco de contágio da COVID-19. Continue se cuidando!");

        scanner.close();

        }
    }

 }