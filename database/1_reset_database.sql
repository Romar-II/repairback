-- Kustutab public schema (mis põhimõtteliselt kustutab kõik tabelid)
DROP SCHEMA repair CASCADE;
-- Loob uue public schema vajalikud õigused
CREATE SCHEMA repair
-- taastab vajalikud andmebaasi õigused
    GRANT ALL ON SCHEMA repair TO postgres;
GRANT ALL ON SCHEMA repair TO PUBLIC;