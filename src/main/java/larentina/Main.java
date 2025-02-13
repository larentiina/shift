package larentina;

import larentina.utils.CommandLineOptions;
import larentina.utils.FileProcess;


public class Main {
    public static void main(String[] args) {
        try {
            CommandLineOptions clo = new CommandLineOptions(args);
            new FileProcess(clo).processInputFiles();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}