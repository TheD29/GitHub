package InClassses;

public class OuterClass {
	private String field = "classs";

	public class innerClass {
		private String field = "classes2";

		public void print() {
			System.out.println("Print Inner class");
			System.out.println(field);
		}

		public class Child {
			public Child() {
				System.out.println(OuterClass.innerClass.this.field);
			}
		}
	}

	public void Some() {
		System.out.println("Outer method print");
	}
}