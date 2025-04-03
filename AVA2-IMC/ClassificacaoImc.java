public class ClassificacaoImc {

    public static String classificar(double imc) {
        if (imc< 18.5) {
            return "Baixo peso. É recomendado procurar um médico para avalação criteriosa.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal";
        } else if (imc>= 25 && imc <= 29.9) {
            return "Sobrepeso. Consulte um médico e reveja hábitos para reverter o quadro.";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I. É importante buscar orientação médica e profissional.";
        }else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II. Buscar por orientação médica é fundamental";
        } else {
            return "Obesidade grau III. Chance de outras doenças associadas é mais elevada. Busque orintação médica imediatamente.";
        }
    }
}