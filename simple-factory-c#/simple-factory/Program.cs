namespace SimpleFactory
{
    public class Program
    {
        public static void Main()
        {
            var userMenu = @"__________________________
                            1. Table Fans
                            2. Ceiling Fans
                            3. Exhaust Fans
                            __________________________";

            Console.WriteLine(userMenu);

            int? inputNumber = null;
            var userInput = Console.ReadLine();
            try
            {
                inputNumber = int.Parse(userInput);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }

            var fanFactory = new FanFactory();

            IFan? fan = inputNumber switch
            {
                1 => fanFactory?.CreateFan(FanType.Table),
                2 => fanFactory?.CreateFan(FanType.Ceiling),
                3 => fanFactory?.CreateFan(FanType.Exhaust),
                _ => throw new NotImplementedException(),
            };

            fan?.BlowAir();

            fan = null;

            fan.BlowAir();
        }
    }
}