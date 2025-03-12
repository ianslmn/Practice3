JAVAC=javac
JAVA=java
SRC_DIR=ceu/programming/practices/practice3
BIN_DIR=bin

SOURCES=$(SRC_DIR)/Practice3.java $(SRC_DIR)/Practice3Main.java
CLASSES=$(BIN_DIR)/Practice3.class $(BIN_DIR)/Practice3Main.class

all: $(BIN_DIR) $(CLASSES)

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java | $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) -cp $(BIN_DIR) $<

$(BIN_DIR):
	mkdir -p $(BIN_DIR)

run: all
	$(JAVA) -cp $(BIN_DIR) edu.ceu.programming.practices.practice3.Practice3Main

clean:
	rm -rf $(BIN_DIR)