
namespace StrategyPattern
{
    public class MergeSort : ISortingStrategy
    {
        public void Sort(List<int> list)
        {
            if (list.Count <= 1)
                return;

            List<int> left = new();
            List<int> right = new();

            int middle = list.Count / 2;

            for (int i = 0; i < middle; i++)
            {
                left.Add(list[i]);
            }

            for (int i = middle; i < list.Count; i++)
            {
                right.Add(list[i]);
            }

            Console.WriteLine($"List: {string.Join(',', list)}");
            Console.WriteLine($"Left: {string.Join(',', left)}");
            Console.WriteLine($"Right: {string.Join(',', right)}");

            Sort(left);
            Sort(right);
            Merge(list, left, right);
        }

        private void Merge(List<int> list, List<int> left, List<int> right)
        {
            int leftIndex = 0, rightIndex = 0, listIndex = 0;

            while (leftIndex < left.Count && rightIndex < right.Count)
            {
                if (left[leftIndex] < right[rightIndex])
                {
                    list[listIndex] = left[leftIndex];
                    leftIndex++;
                }
                else
                {
                    list[listIndex] = right[rightIndex];
                    rightIndex++;
                }
                listIndex++;
            }

            while (leftIndex < left.Count)
            {
                list[listIndex] = left[leftIndex];
                leftIndex++;
                listIndex++;
            }

            while (rightIndex < right.Count)
            {
                list[listIndex] = right[rightIndex];
                rightIndex++;
                listIndex++;
            }
        }
    }
}