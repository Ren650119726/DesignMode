package statemodel4;


public enum State {
	
	TEEN {
		@Override
		public void perform() {
			System.out.println("我是青年时候，精力旺盛");
		}

		@Override
		public State nextState() {
			return MIDDLE;
		}
	},
	MIDDLE {
		@Override
		public void perform() {
			System.out.println("一到中年时候就力不从心啊");
		}

		@Override
		public State nextState() {
			return OLD;
		}
	},
	OLD {
		@Override
		public void perform() {
			System.out.println("老年了，日落西山");
		}

		@Override
		public State nextState() {
			return TEEN;
		}
	};
	
	public abstract void perform();
	
	public abstract State nextState();
}
