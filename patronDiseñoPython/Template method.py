from abc import ABC, abstractmethod

# Clase base con el método plantilla
class BebidaCaliente(ABC):

    def preparar(self):
        self.hervir_agua()
        self.preparar_ingrediente_principal()
        self.servir_en_taza()
        self.agregar_extras()

    def _pausar(self):
        print(f"Clase: {self.__class__.__name__}")
        input("Presiona Enter para continuar...\n")
        print("---")

    def hervir_agua(self):
        print("Hirviendo agua...")
        self._pausar()

    @abstractmethod
    def preparar_ingrediente_principal(self):
        pass

    def servir_en_taza(self):
        print("Sirviendo en la taza...")
        self._pausar()

    @abstractmethod
    def agregar_extras(self):
        pass

# Subclase para preparar té
class Te(BebidaCaliente):
    def preparar_ingrediente_principal(self):
        print("Remojando la bolsita de té...")
        self._pausar()

    def agregar_extras(self):
        print("Agregando limón...")
        self._pausar()

# Subclase para preparar café
class Cafe(BebidaCaliente):
    def preparar_ingrediente_principal(self):
        print("Agregando café molido al agua...")
        self._pausar()

    def agregar_extras(self):
        print("Agregando azúcar y leche...")
        self._pausar()

# Uso
def main():
    print("Preparando té:")
    print("==============")
    bebida = Te()
    bebida.preparar()

    print("\nPreparando café:")
    print("===============")
    bebida = Cafe()
    bebida.preparar()

if __name__ == "__main__":
    main()
