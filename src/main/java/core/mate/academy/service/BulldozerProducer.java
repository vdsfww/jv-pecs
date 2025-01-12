package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozerProducers = new ArrayList<>();
        bulldozerProducers.add(new Bulldozer());
        bulldozerProducers.add(new Bulldozer());
        return bulldozerProducers;
    }
}
