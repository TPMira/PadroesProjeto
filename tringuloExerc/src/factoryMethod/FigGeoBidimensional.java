package factoryMethod;

public class FigGeoBidimensional {
	
	private static double A;
	private static double B;
	private static double C;

	public static Triangulo criarTriangulo(double A, double B, double C) {

		FigGeoBidimensional.A =A;
		FigGeoBidimensional.B =B;
		FigGeoBidimensional.C =C;
		
		throwIf(valoresIncorretos(),MenssagemDeErro.VALOR_INCORRETO);
        throwIf(condicaoExistencia(),MenssagemDeErro.VALOR_INCORRETO);
        
        Triangulo triangulo;
        if (isEquilatero())	triangulo = new Equilatero();
        else if (isIsosceles())	triangulo = new Isosceles();
        else triangulo = new Escaleno();
        
        triangulo.setA(A);
        triangulo.setB(B);
        triangulo.setC(C);
        
        return triangulo;
        
	}

	private static boolean valoresIncorretos() {
		return A <= 0 || B <= 0 || C <= 0;
	}

	static boolean condicaoExistencia() {
		return A > B + C || B > A + C || C > A + B;
	}

	private static boolean isEquilatero() {
		return A == B && B == C;
	}

	private static boolean isIsosceles() {
		return A == B || B == C || C == A;
	}
	
    private static void throwIf(boolean condicao, String message) {
        if (condicao) {
            throw new IllegalArgumentException(message);
        }
    }
}

