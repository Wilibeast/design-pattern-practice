namespace SimpleFactory
{
    public class ExhaustFan : IFan
    {
        public void BlowAir()
        {
            Console.WriteLine("brrrrrr...");
        }
    }
}