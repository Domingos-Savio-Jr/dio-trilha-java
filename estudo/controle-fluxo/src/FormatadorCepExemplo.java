public class FormatadorCepExemplo {
    
    public static void main (String[] args){
        try{
            String cepFormatado = formatarCep("2352498");
        System.out.println(cepFormatado);
    }catch (CepInvalidoExcessao e){
        System.out.println("O cep deve conter 8 caracteres");
    }
    }
    static String formatarCep(String cep) throws CepInvalidoExcessao{
        if (cep.length() !=8 ){
            throw new CepInvalidoExcessao();

        }
    }
}
