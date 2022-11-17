package javaToJson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClassFile {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * String str ="n"; String[] w =str.split("\\s"); String result =""; for(int i
		 * =0; i < w.length ;i++) { String t = w[i].substring(0,1).toUpperCase(); String
		 * r = w[i].substring(1); result = result+ t+ r +" "; }
		 * System.out.println(result);
		 */
	Hello h = new Hello();	
	Hello1 h1 = new Hello1();	
	Hello2 h2 = new Hello2();	
	Hello3 h3 = new Hello3();	
	Hello4 h4 = new Hello4();
	Hello5 h5 = new Hello5();	
	
	

	
	ExecutorService es = Executors.newFixedThreadPool(2);
	es.submit(h);
	es.submit(h1);
	es.submit(h2);
	es.submit(h3);
	es.submit(h4);
	es.submit(h5);
   
	
	es.shutdown();

	
	}
	

}

class Hello implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i<=10 ;i++) {
			System.out.println("thread Zero " + i +" " +Thread.currentThread().getName());
		}}}
class Hello5 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i<=10 ;i++) {
			System.out.println("thread five " + i +" " +Thread.currentThread().getName());
		}}}
class Hello2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i<=10 ;i++) {
			System.out.println("thread two " + i +" " + Thread.currentThread().getName());
		}}}
class Hello3 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i<=10 ;i++) {
			System.out.println("thread three " + i +" " +Thread.currentThread().getName());
		}}}
class Hello4 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i<=10 ;i++) {
			System.out.println("thread four " + i +" " +Thread.currentThread().getName());
		}}}
class Hello1 implements Runnable{

	@Override
	public void run() {
		for(int i=0 ;i<=10 ;i++) {
			
			System.out.println("thread one " + i +" "+Thread.currentThread().getName());
		}
		
	}
	
}