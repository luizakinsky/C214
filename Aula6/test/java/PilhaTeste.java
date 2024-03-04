
import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

import br.inatel.cdg.Pilha;

public class PilhaTeste {
	
	@Test
	public void testePilhaVazia() {
		Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
		boolean vazia = pilhaInteiros.pilhaVazia();
		assertTrue(vazia);
	}
	
	@Test
	public void testePilhaPush() {
		Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
		pilhaInteiros.push(23);
		int tamanho = pilhaInteiros.size();
		
		assertEquals(1, tamanho);
	}
	
	@Test
	public void testePilhaPopSize() {
		Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
		pilhaInteiros.push(13);
		pilhaInteiros.pop();
		int tamanho = pilhaInteiros.size();
		assertEquals(0, tamanho);
	}
	
	@Test(expected = EmptyStackException.class)
	public void testePilhaPopException() {
		Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
		int retorno = pilhaInteiros.pop();
	}
	
	@Test
	public void testePilhaPopRetorno() {
		Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
		int valor = 13;
		pilhaInteiros.push(valor);
		
		int retorno = pilhaInteiros.pop();
		assertEquals(valor, retorno);
	}
}
