package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> sequence;

	public OneListAcceptable(List<T> list) {
		super();
		this.sequence = new LinkedList<>(list);
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {

			private Iterator<T> iter = sequence.iterator();

			private boolean areTwoElemsEqual(T a, T b) {
				return a.equals(b);
			}

			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if (!(iter.hasNext() && areTwoElemsEqual(iter.next(), newElement))) {
					throw new ElementNotAcceptedException(newElement);
				}

			}

			@Override
			public void end() throws EndNotAcceptedException {
				// TODO Auto-generated method stub

			}

		};
	}

}
