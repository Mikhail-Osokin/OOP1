package Homework4;

  static class Box {

    public <Fruit extends Apple, Orange> void add(Fruit fruit) { // FIXME Должен быть дженерик!
      // FIXME Реализовать добавления фрукта
      throw new UnsupportedOperationException();
    }

    public int getWeight() {
      // FIXME Реализовать подсчет суммарного веса
      throw new UnsupportedOperationException();
    }

    public <Box extends Fruit> void move(Box another) { // FIXME Должен быть дженерик!
      // FIXME Реализовать пересыпание
      throw new UnsupportedOperationException();
    }

  }

static class Fruit {

        private int weight;
    
        public Fruit(int weight) {
          this.weight = weight;
        }
    
        public int getWeight() {
          return weight;
        }
      }
    
      static class Apple extends Fruit {
        public Apple(int weight) {
          super(weight);
        }
      }
    
      static class GoldenApple extends Apple {
        public GoldenApple(int weight) {
          super(weight);
        }
      }
    
      static class Orange extends Fruit {
        public Orange(int weight) {
          super(weight);
        }
      }
    
    }
}