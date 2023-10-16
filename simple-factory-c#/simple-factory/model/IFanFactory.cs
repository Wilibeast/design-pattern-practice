namespace SimpleFactory
{
    public interface IFanFactory
    {
        IFan CreateFan(FanType fanType);
    }
}