
namespace StrategyPattern
{
    public class BubbleSort : ISortingStrategy
    {
        public void Sort(List<int> list)
        {
            int listLength = list.Count;

            for (int i = 0; i < listLength; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    if (list[j] > list[j + 1])
                    {
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                    }
                }
            }
        }
    }
}