package DesignPatterns;

public class BuilderDesignPattern {

	public static void main(String[] args) {
	Mobile mob =new	Mobile.MobileBuilder().setBattry(4500).setColour("Black").setName("SamSung").build();
		System.out.println(mob);

	}
}

class Mobile{
	
	
	
	
	public int getRam() {
		return ram;
	}
	
	public int getBattry() {
		return battry;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColour() {
		return colour;
	}

	private Mobile(MobileBuilder mbuilder) {
		this.ram =mbuilder.ram;
		this.colour=mbuilder.colour;
		this.name= mbuilder.name;
		this.battry=mbuilder.battry;
		
		
	}
	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", battry=" + battry + ", name=" + name + ", colour=" + colour + "]";
	}
	int ram;
	int battry ;
	String name;
	String colour ;
	public static class  MobileBuilder {
		int ram;
		int battry ;
		String name;
		String colour ;
		public MobileBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		public MobileBuilder setBattry(int battry) {
			this.battry = battry;
			return this;
		}
		public MobileBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public MobileBuilder setColour(String colour) {
			this.colour = colour;
			return this;
		}
		
		
		public MobileBuilder() {
		
		}
		
		public Mobile build() {
			return new Mobile(this);}
	}
		
}