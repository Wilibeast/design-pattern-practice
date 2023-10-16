
namespace SimpleFactory
{
    public class FanFactory : IFanFactory
    {
        public IFan CreateFan(FanType fanType)
        {
            return fanType switch
            {
                FanType.Table => new TableFan(),
                FanType.Ceiling => new CeilingFan(),
                FanType.Exhaust => new ExhaustFan(),
                _ => new TableFan(),
            };
        }
    }
}