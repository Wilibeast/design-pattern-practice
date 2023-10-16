namespace SingletonPattern
{
    public class Database
    {
        private static Database? instance;
        private readonly DateTime initializedTimestamp;

        public Database()
        {
            this.initializedTimestamp = DateTime.Now;
        }

        public static Database Instance
        {
            get
            {
                instance ??= new Database();
                return instance;
            }
        }

        public void DoDatabaseStuff()
        {
            Console.WriteLine($"Initialized on {initializedTimestamp}");
            Console.WriteLine("Doing database stuff...");
        }
    }
}