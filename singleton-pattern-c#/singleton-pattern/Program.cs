namespace SingletonPattern
{
    public class Program
    {
        public static void Main()
        {
            var database = Database.Instance;
            database.DoDatabaseStuff();

            var databaseTwo = Database.Instance;
            databaseTwo.DoDatabaseStuff();

            var databaseThree = Database.Instance;
            databaseThree.DoDatabaseStuff();
        }
    }
}