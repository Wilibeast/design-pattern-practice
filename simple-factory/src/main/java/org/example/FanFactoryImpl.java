package org.example;

public class FanFactoryImpl implements FanFactory {
    @Override
    public Fan createFan(FanType fanType) {
        return switch (fanType) {
            case CEILING -> new CeilingFan();
            case EXHAUST -> new ExhaustFan();
            case TABLE -> new TableFan();
        };
    }
}
