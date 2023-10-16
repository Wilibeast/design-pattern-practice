namespace StrategyPattern
{
    public class Sorter
    {
        private ISortingStrategy strategy;

        public Sorter(ISortingStrategy strategy)
        {
            this.strategy = strategy;
        }

        public void SetStrategy(ISortingStrategy strategy)
        {
            this.strategy = strategy;
        }

        public void PerformSort(List<int> list)
        {
            strategy.Sort(list);
        }
    }
}