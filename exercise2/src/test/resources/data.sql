INSERT INTO galaxy (id, name) VALUES (random_uuid(), 'Melkweg');
INSERT INTO galaxy (id, name) VALUES (random_uuid(), 'Andromeda');

INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id) values (random_uuid(), 'Zon', null, null, null);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id) values (random_uuid(), 'Jupiter', 11.862, 0.0489, null);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id) values (random_uuid(), 'Venus', null, null, null);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id) values (random_uuid(), 'Mars', null, null, null);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id) values (random_uuid(), 'Saturnus', null, null, null);