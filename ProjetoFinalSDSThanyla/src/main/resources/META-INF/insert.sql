INSERT INTO estado (id, nome, uf) VALUES (1, 'Acre', 'AC');
INSERT INTO estado (id, nome, uf) values (2, 'Alagoas', 'AL');
INSERT INTO estado (id, nome, uf) values (3, 'Amazonas', 'AM');


INSERT INTO cidade (id, nome, estado_id) VALUES (1, 'Afonso Cláudio', 1);
INSERT INTO cidade (id, nome, estado_id) values (2, 'Água Doce do Norte', 1);
INSERT INTO cidade (id, nome, estado_id) values (3, 'Águia Branca', 2);


INSERT INTO bairro (id, nome, cidade_id) VALUES (1, 'Aurenny I', 1);
INSERT INTO bairro (id, nome, cidade_id) VALUES (2, 'Aurenny II', 1);
INSERT INTO bairro (id, nome, cidade_id) VALUES (3, 'Aurenny III', 2);
INSERT INTO bairro (id, nome, cidade_id) VALUES (4, 'Taquaralto', 3);

INSERT INTO hotel (id, nome, bairro_id) VALUES (1, 'Mob Choir', 1);
INSERT INTO hotel (id, nome, bairro_id) VALUES (2, 'Tenshi no Thesis', 2);
INSERT INTO hotel (id, nome, bairro_id) VALUES (3, 'Impact', 3);
INSERT INTO hotel (id, nome, bairro_id) VALUES (4, 'Howling', 4);

INSERT INTO hotelquarto (quartoNum, andar, totalCamas, preco, hotel_id) VALUES ( 1, 1, 1, 150, 1);