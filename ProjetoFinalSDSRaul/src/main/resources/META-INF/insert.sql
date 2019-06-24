INSERT INTO estado (id, nome, uf) VALUES (1, 'Acre', 'AC');
INSERT INTO estado (id, nome, uf) VALUES (2, 'Alagoas', 'AL');
INSERT INTO estado (id, nome, uf) VALUES (3, 'Amazonas', 'AM');


INSERT INTO cidade (id, nome, estado_id) VALUES (1, 'Afonso Cláudio', 1);
INSERT INTO cidade (id, nome, estado_id) VALUES (2, 'Água Doce do Norte', 1);
INSERT INTO cidade (id, nome, estado_id) VALUES (3, 'Águia Branca', 2);

INSERT INTO piloto (id, nome) VALUES (1, 'Mydoria');
INSERT INTO piloto (id, nome) VALUES (2, 'Shoto');
INSERT INTO piloto (id, nome) VALUES (3, 'Tokoyami');

INSERT INTO aviao (id, qtdpassageiros) VALUES (1, 60);
INSERT INTO aviao (id, qtdpassageiros) VALUES (2, 55);

INSERT INTO companhiaaerea (id, nome) VALUES (1, 'All Might');
INSERT INTO companhiaaerea (id, nome) VALUES (2, 'Endevor');

INSERT INTO voo (id, datahorachegada, datahorapartida, numerovoo, preco, aviao_id, cidadedestino_id, cidadeorigem_id, companhia_id, piloto_id) VALUES (1, 'DATA: 2019/07/07 - HORA: 12:30', 'DATA: 2019/07/07 - HORA: 14:50', '032', 250.00, 1, 3, 1, 1, 1);

INSERT INTO voo (id, datahorachegada, datahorapartida, numerovoo, preco, aviao_id, cidadedestino_id, cidadeorigem_id, companhia_id, piloto_id) VALUES (2, 'DATA: 2019/07/08 - HORA: 13:30', 'DATA: 2019/07/08 - HORA: 16:55', '033', 350.00, 2, 1, 2, 2, 2);

INSERT INTO voo (id, datahorachegada, datahorapartida, numerovoo, preco, aviao_id, cidadedestino_id, cidadeorigem_id, companhia_id, piloto_id) VALUES (3, 'DATA: 2019/07/09 - HORA: 14:30', 'DATA: 2019/07/09 - HORA: 19:00', '034', 500.00, 1, 2, 3, 1, 3);