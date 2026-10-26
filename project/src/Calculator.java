class Calculator {
    private OperationStrategy strategy;

        public void setStrategy(OperationStrategy strategy) {
            this.strategy = strategy;
        }

        public int calculate(int a, int b) {
            return strategy.calculate(a, b);
        }
}
