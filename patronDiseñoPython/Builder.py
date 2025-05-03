# El producto final
class Hamburguesa:
    def __init__(self):
        self.pan = None
        self.carne = None
        self.queso = None
        self.vegetales = []
        self.salsas = []

    def __str__(self):
        return f"Hamburguesa con pan: {self.pan}, carne: {self.carne}, queso: {self.queso}, " \
               f"vegetales: {', '.join(self.vegetales)}, salsas: {', '.join(self.salsas)}"

# El Builder
class HamburguesaBuilder:
    def __init__(self):
        self.hamburguesa = Hamburguesa()

    def _pausar(self, metodo):
        print(f"Clase: {self.__class__.__name__} | Acción: {metodo}")
        input("Presiona Enter para continuar...\n")

    def elegir_pan(self, tipo):
        self.hamburguesa.pan = tipo
        self._pausar("elegir_pan")
        return self

    def elegir_carne(self, tipo):
        self.hamburguesa.carne = tipo
        self._pausar("elegir_carne")
        return self

    def agregar_queso(self, tipo):
        self.hamburguesa.queso = tipo
        self._pausar("agregar_queso")
        return self

    def agregar_vegetal(self, vegetal):
        self.hamburguesa.vegetales.append(vegetal)
        self._pausar("agregar_vegetal")
        return self

    def agregar_salsa(self, salsa):
        self.hamburguesa.salsas.append(salsa)
        self._pausar("agregar_salsa")
        return self

    def construir(self):
        self._pausar("construir")
        return self.hamburguesa

# Director (opcional)
class Chef:
    def _pausar(self, metodo):
        print(f"Clase: {self.__class__.__name__} | Acción: {metodo}")
        input("Presiona para continuar...\n")

    def preparar_cheeseburger_clasica(self, builder):
        self._pausar("preparar_cheeseburger_clasica")
        return (builder.elegir_pan("pan con ajonjolí")
                      .elegir_carne("res")
                      .agregar_queso("cheddar")
                      .agregar_vegetal("lechuga")
                      .agregar_vegetal("tomate")
                      .agregar_salsa("ketchup")
                      .construir())

# Uso
builder = HamburguesaBuilder()
chef = Chef()

hamburguesa = chef.preparar_cheeseburger_clasica(builder)
print(hamburguesa)
