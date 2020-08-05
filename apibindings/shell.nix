{ pkgs ? import <nixpkgs> {} }:
pkgs.mkShell {
  buildInputs = with pkgs; [ bash ruby gemrb bundler ];
  shellHook = ''
    bundle
  '';
}
