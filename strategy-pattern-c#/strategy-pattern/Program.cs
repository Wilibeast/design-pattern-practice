using System.Collections;

namespace StrategyPattern
{
    public static class Program
    {
        public static void Main()
        {
            var numberList = new List<int>() { 5, 2, 3, 6, 7, 1, 2, 6, 9, 123 };
            var sorter = new Sorter(new BubbleSort());

            Console.WriteLine("Unsorted list:");
            Console.WriteLine(string.Join(',', numberList));

            sorter.PerformSort(numberList);

            Console.WriteLine("Bubble sorted List:");
            Console.WriteLine(string.Join(',', numberList));

            numberList = new List<int>() { 5, 2, 3, 6, 7, 1, 2, 6, 9, 123 };

            Console.WriteLine("Unsorted List:");
            Console.WriteLine(string.Join(',', numberList));

            sorter.SetStrategy(new MergeSort());
            sorter.PerformSort(numberList);

            Console.WriteLine("Merge sorted List:");
            Console.WriteLine(string.Join(',', numberList));
        }
    }
}