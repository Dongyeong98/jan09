package coll;

import java.util.Stack;

//p768
//동전 클래스
/* LIFO last in first out
 *FIFO first in first out
 */


class Coin{
	private int value;
	public Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
public class Stack02 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100)); //Stack 메모리에 100이 저장된다. 얘가 제일 밑에 깔려있다.
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10)); //마지막에 들어가있어 제일 위에있다
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 :" + coin.getValue());
		}
		
		
	}
}
