package PartI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Packet{
	private int priority;
	private Byte[] payload;
	
	public Packet(Byte[] payload, int priority) {
		this.priority = priority;
		this.payload = payload;
		// figure out how this works
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public Byte[] getPayload() {
		return this.payload;
	}
	

	
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
				
		for (int i=0;i<10;i++) {
			Byte[] payload = new Byte[256];
			int priority = (int)Math.random()*5 + 1;
			Packet p = new Packet(payload, priority);
			pq.add(p);
		}
		
		while (!pq.isEmpty()) {
			Packet cur = (Packet) pq.poll();
			System.out.println("got packet " + cur.getPayload() + ", priority: " + cur.getPriority());
		}
	}

}

class PacketComparator implements Comparator<Packet>{

	@Override
	public int compare(Packet p1, Packet p2) {
		if(p1.getPriority()>=p2.getPriority()) return -1;
		else return 1;

	}
	
}
