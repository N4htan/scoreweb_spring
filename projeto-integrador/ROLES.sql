insert into roles(role_id, role) values (1, 'ADMIN');

insert into user_role(user_id, role_id) values (1, 1);
insert into user_role(user_id, role_id) values (2, 1);
insert into user_role(user_id, role_id) values (3, 1);
insert into user_role(user_id, role_id) values (4, 1);
insert into user_role(user_id, role_id) values (5, 1);
insert into user_role(user_id, role_id) values (6, 1);
insert into user_role(user_id, role_id) values (7, 1);
insert into user_role(user_id, role_id) values (8, 1);
insert into user_role(user_id, role_id) values (9, 1);
insert into user_role(user_id, role_id) values (10, 1);

insert into rewards( id, custo, descricao, imagem) values (1, 180, 'Consultoria Financeira Pessoal'); 
insert into rewards( id, custo, descricao) values (2, 250, 'Consultoria Financeira Familiar'); 
insert into rewards( id, custo, descricao) values (3, 450, 'Empreendedorismo: Como Se Preparar Para Abrir uma Empresa'); 
insert into rewards( id, custo, descricao) values (4, 2080, 'Planejador Financeiro Profissional'); 
insert into rewards( id, custo, descricao) values (5, 700, 'Gestão Financeira - Controle Financeiro Para Autônomos e MEI');

UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '1');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '2');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '3');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '4');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '5');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '6');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '7');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '8');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '9');
UPDATE `projetointegrador`.`users` SET `pontos` = '1000' AND `score` = '800' WHERE (`user_id` = '10');